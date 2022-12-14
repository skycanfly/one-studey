package com.daxian.product.controller;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RSemaphore;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: daxian
 * @Date: 2022/11/27 18:14
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/get")
    public String hello() {
        RLock lock = redissonClient.getLock("name");
        lock.lock();
        try {
            System.out.println("加锁成功，执行业务" + Thread.currentThread().getId());
            Thread.sleep(3000);
        } catch (Exception e) {
        } finally {
            System.out.println("释放所" + Thread.currentThread().getId());
            lock.unlock();
        }
        return "hello";
    }

    /**
     * 信号量测试
     * @return
     * @throws InterruptedException
     */
    @GetMapping("/du")
    public String add() throws InterruptedException {
        RSemaphore add = redissonClient.getSemaphore("add");
        boolean b = add.tryAcquire();
        return  "ok"+b;
    }
    @GetMapping("/sub")
    public String sub() throws InterruptedException {
        RSemaphore add = redissonClient.getSemaphore("add");
        add.release();
        return  "ok";
    }
}

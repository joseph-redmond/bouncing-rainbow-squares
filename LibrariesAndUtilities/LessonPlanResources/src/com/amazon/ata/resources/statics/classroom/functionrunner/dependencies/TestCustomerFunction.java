package com.amazon.ata.resources.statics.classroom.functionrunner.dependencies;

import java.security.SecureRandom;
import java.util.Random;

public class TestCustomerFunction implements CustomerFunction {
    @Override
    public void run() {
        System.out.println("Running customer function!");
        try {
            Thread.sleep(new SecureRandom().nextInt(1000));
        } catch (InterruptedException e) {
            System.out.println("Hm. we were interrupted while sleeping--er, computing something--on the job.");
        }
    }
}

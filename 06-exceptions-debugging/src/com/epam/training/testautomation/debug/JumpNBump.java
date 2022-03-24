package com.epam.training.testautomation.debug;

public class JumpNBump {

    public static void main(String... args) {
        JumpNBump jumpie = new JumpNBump();
        jumpie.haveFun();
    }

    private void haveFun() {
        a();
        j();
    }

    private void a() {
        System.out.println("Inside a.");
        b();
    }

   private void b() {
        System.out.println("Inside b.");
        c();
    }

   private void c() {
        System.out.println("Inside c.");
        e();
    }

   private void d() {
        System.out.println("Inside d.");
        f();
    }

   private void e() {
        System.out.println("Inside e.");
        d();
    }

   private void f() {
        System.out.println("Inside f.");
        g();
        h();
        i();
    }

   private void g() {
        System.out.println("Inside g.");
    }

   private void h() {
        System.out.println("Inside h.");
    }

   private void i() {
        System.out.println("Inside i.");
    }

   private void j() {
        System.out.println("Inside j.");
    }

}

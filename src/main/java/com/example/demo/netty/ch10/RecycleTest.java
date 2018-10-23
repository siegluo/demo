package com.example.demo.netty.ch10;

import io.netty.util.Recycler;

public class RecycleTest {
    private static final Recycler<User> RECYCLER = new Recycler<User>() {
        @Override
        protected User newObject(Handle<User> handle) {
            return new User(handle);
        }
    };

    private static class User {
        private final Recycler.Handle<User> handle;

        public User(Recycler.Handle<User> handle) {
            this.handle = handle;
        }

        public void recycle() {
            handle.recycle(this);
        }
    }

    public static void main(String[] args) {
        User user = RECYCLER.get();

        user.recycle();
        RECYCLER.get().recycle();

        User user1 = RECYCLER.get();

        System.out.println(user1 == user);
    }
}

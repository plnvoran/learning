package com.learing;
class GenericsType<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType type1 = new GenericsType();
        type1.set("Str");
        type1.set(10);

        String a = type1.get().toString();

        int i = (Integer) type1.get();

        Object b= "4";
        int c = (Integer) b;
    }
}
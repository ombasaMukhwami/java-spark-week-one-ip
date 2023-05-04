package com.ombasa;


public final class Main {

    private Main() {

    }
    public static void main(String[] args) {
        System.out.println("Hello world! hehhe");
//        String test = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
//        String result ="QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";

        String test = "B@#";

        Cryptor enCryptor = new Cryptor(1);
       var rs =  enCryptor.encrypt(test);
       var ee = enCryptor.descrypt(rs);
        System.out.printf(rs);
    }
}

package com.heroku.application;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world");
         String test = " wiki technology is the ease with which pages can be created and updated. Generally, there is no review by a moderator or gatekeeper before modifications are accepted and thus lead to changes on the website. Many wikis are open to alteration by the general public without requiring registration of user accounts. Many edits can be made in real-time and appear almost instantly online, but this feature facilitates abuse of the system. Private wiki servers require user authentication to edit pages, and sometimes even to read them. Maged N. Kamel Boulos, Cito Maramba, and Steve Wheeler write that the open wikis produce a process of Social Darwinism. \"... because of the openness and rapidity that wiki pages can be edited, the pages undergo an evolutionary selection process, not unlike that which nature subjects to living organisms.";
          test = test.replace("...","___");

        String[] a = test.split("\\.");

        System.out.println("no of dot -> "+a.length);

        String b = test.replaceAll("\\.","\n");
        b = b.replace("___","...");

        System.out.println("sentence in aligned  ->  \n"+b);

        System.out.println("whether private is in after ... dot ->"+test.split("...")[1].contains("private"));

    }



}

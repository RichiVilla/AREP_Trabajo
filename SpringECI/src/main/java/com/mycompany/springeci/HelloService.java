/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springeci;

@RestController
public class HelloService {
    
   @GetMapping("/hello")
    public static String hello(){
       return "Hello world!";
   }
    
    @GetMapping("/pi")
    public static String pi(){
       return "3,1415926535897932384626433832795028841971693993751058209749445923078164062...";
   }
    
    @GetMapping("/aureo")
    public static String aureo(){
       return "1,618";
   }
    
    @GetMapping("/euler")
    public static String euler(){
       return " 2,7182818284 …";
   }
    
    @GetMapping("/sueno")
    public static String sueno(){
       return "zzz... zzz... zzz...";
   }
}

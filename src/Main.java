/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import clothes.Ruha;

public class Main {

    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        Ruha ruha1 = new Ruha("Marci");
        mosoda.ruhaBevetel(ruha1);

// Simulating washing the clothes
        mosoda.mosas("Marci");

// Checking if the clothes are clean
        System.out.println(ruha1.isTiszta()); // This should print true

   

        // Példa használat
        mosoda.ruhaBevetel(new Ruha("Juli"));
        mosoda.ruhaBevetel(new Ruha("Gizi"));
        mosoda.ruhaBevetel(new Ruha("Gyula"));

        mosoda.ruhaKivetel("Juli");
        mosoda.ruhaKivetel("Gizi");
        mosoda.ruhaKivetel("Gyula");
    }
}

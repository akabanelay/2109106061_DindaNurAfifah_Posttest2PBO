/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1pbo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Posttest1PBO {
    public static void main(String[] args) throws IOException {
        AssetPerusahaan hr = new AssetPerusahaan();
        Asset data = new Asset();
        
        Scanner input = new Scanner(System.in);
        int pilihan;
        do{
            menu();
            pilihan = input.nextInt();
            
            switch(pilihan){
            case 1:
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("=                                        DATA ASSET                                   =");
                System.out.println("=======================================================================================");
                hr.tampil();
                break;
            case 2:
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("                                          ADD DATA                                     ");
                System.out.print("ID ASSET    : ");
                int IdAsset = input.nextInt();
                input.nextLine();
                System.out.print("NAMA ASSET  : ");
                String NamaAsset = input.nextLine();
                System.out.print("DIVISI      : ");
                String Divisi = input.nextLine();
                System.out.print("KUANTITAS   : ");
                int Kuantitas = input.nextInt();
                input.nextLine();
                System.out.print("HARGA       : ");
                int Harga = input.nextInt();
                input.nextLine();
                data = new Asset (NamaAsset, Divisi, IdAsset, Kuantitas, Harga);
                hr.add(data);
                break;
            case 3:
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("                                        UPDATE DATA                                    ");
                hr.tampil();
                System.out.println("\n=======================================================================================");
                System.out.print("Choose ID ASSET: ");
                int rdId = input.nextInt();
                hr.update(rdId, input);
                break;
            case 4 :
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("                                        DELETE DATA                                    ");
                hr.tampil();
                System.out.println("\n=======================================================================================");
                System.out.print("Choose ID ASSET: ");
                int dId = input.nextInt();
                hr.delete(dId);
                break;
            case 5 :
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("                                           EXIT...                                     ");
                System.exit(0);
            default:
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("                                        MENU NOT EXIST                                 ");
                break;
            }
        
        }
        while (pilihan != 5);
    }
        
    
    public static void menu(){
        System.out.println("\n");
        System.out.println("=======================================================================================");
        System.out.println("=                                            MENU                                     =");
        System.out.println("=======================================================================================");
        System.out.println("=                                    [1] Read Asset                                   =");
        System.out.println("=                                    [2] Add Asset                                    =");
        System.out.println("=                                    [3] Update Asset                                 =");
        System.out.println("=                                    [4] Delete Asset                                 =");
        System.out.println("=                                    [5] Exit                                         =");
        System.out.println("=======================================================================================");
        
        System.out.println("Pilih Menu: [1/2/3/4/5]");
        
               
        }
 }


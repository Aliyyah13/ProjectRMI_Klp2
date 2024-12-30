/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropertiRMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Services extends UnicastRemoteObject implements OperationRMI {

    public Services() throws RemoteException {
        super();
    }

    @Override
    public double calculateRent(double hargaDasar, int luasProperti, String lokasi, String fasilitas, String keamanan) throws RemoteException {
        double multiplier = 1.0;

        // Lokasi
        switch (lokasi.toLowerCase()) {
            case "pusat bisnis":
                multiplier *= 1.5;
                break;
            case "pinggiran kota":
                multiplier *= 1.2;
                break;
            case "perumahan":
                multiplier *= 1.0;
                break;
            default:
                throw new IllegalArgumentException("Lokasi tidak valid");
        }

        // Fasilitas
        switch (fasilitas.toLowerCase()) {
            case "basic":
                multiplier *= 1.0;
                break;
            case "intermediate":
                multiplier *= 1.2;
                break;
            case "premium":
                multiplier *= 1.5;
                break;
            default:
                throw new IllegalArgumentException("Fasilitas tidak valid");
        }

        // Keamanan
        switch (keamanan.toLowerCase()) {
            case "tinggi":
                multiplier *= 1.2;
                break;
            case "sedang":
                multiplier *= 1.1;
                break;
            default:
                throw new IllegalArgumentException("Keamanan tidak valid");
        }

        return hargaDasar * luasProperti * multiplier;
    }

}

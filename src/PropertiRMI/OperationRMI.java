/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PropertiRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperationRMI extends Remote {
    double calculateRent(double hargaDasar, int luasProperti, String lokasi, String fasilitas, String keamanan) throws RemoteException;
}

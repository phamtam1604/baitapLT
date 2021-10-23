/*
* creted date: 21 thg 10, 2021
* author: cgm
*/
package com.tampv2008110296.baiTapTuan7;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
        Square square = new Square( "hinhVuong.aif" );
        Circle circle = new Circle( "hinhTron.aif" );
        Amoeba amoeba = new Amoeba(" amoeba.hif");
        amoeba.rotate();
        amoeba.playSound();
        
    }
    
}

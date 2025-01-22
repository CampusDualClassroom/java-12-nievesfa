package com.campusdual.classroom;

import java.util.concurrent.SynchronousQueue;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car("Citroën", "picasso", "Diesel");

        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)

        myCar.start();
        myCar.accelerate();
        myCar.stop();

        //Acelerar el coche
        myCar.accelerate();

        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        myCar.speedometer = 120;
        myCar.accelerate();

        //Frenar la velocidad
        myCar.brake();

        //Frenar hasta un valor negativo (y comprobar que no se puede)
        myCar.stop();

        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);

        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        myCar.turnAngleOfWheels(50);

        //Detener el coche y poner marcha atrás

        myCar.stop();  // Debería apagar el coche
        myCar.setReverse(true);  // Debería aceptar marcha atrás

        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        myCar.accelerate();
        myCar.setReverse(true);


    }

}










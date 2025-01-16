package com.campusdual.classroom;

public class Car {

    public Car() {
    }

    public String brand;
    public String model;
    public String fuel;
    public static final int MAX_SPEED = 120;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;


    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }


    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer == this.MAX_SPEED) {
            System.out.println("Velocidade máxima alcanzada");
        } else {
            if (this.isReverse() && this.speedometer == 25) {
                System.out.println("O vehículo non pode ir a máis velocidade marcha atrás.");
            } else {
                this.speedometer += 5;
                System.out.println("A nova velocidade é " + this.speedometer);
            }
        }
    }

    public void brake() {
        if (this.speedometer == 0) {
            System.out.println("O vehículo xa está detido");
        } else {
            this.speedometer -= 5;
            if (this.speedometer < 0) this.speedometer = 0;
            System.out.println("A nova velocidade é " + this.speedometer);
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println("El volante ya esta en el maximo giro a la derecha: " + wheelsAngle);
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
            System.out.println(" El volante ya esta en el máximo giro a la izquierda" + wheelsAngle);
        } else {
            this.wheelsAngle = newAngle;
        }
    }

    private boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.tachometer > 0 && this.speedometer == 0) {
            if (this.isReverse() == reverse) {
                System.out.println("O vehículo xa ten esa marcha indicada.");
            } else {
                this.reverse = reverse;
                if (reverse) {
                    this.gear = "R";
                } else {
                    this.gear = "N";
                    System.out.println("Punto morto ou adiante");
                }
            }
            System.out.println("A marcha engranada e " + this.gear);
        } else {
            System.out.println("Non se pode cambiar á marcha atrás sen estar parado.");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        if (this.tachometer > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTachometerEqualToZero() {
        if (this.tachometer == 0) {
            return true;
        } else {
            return false;
        }
    }


}




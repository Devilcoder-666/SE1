package model;

public class Car extends Vehicle {
    public Car(double weight, double length, String registrationNumber) {
        super(weight, length, registrationNumber);
    }
    public Car() {
    }
    @Override
    public void setLength(double length) throws InvalidLengthException {
        if(!validateLength(length)){
            throw new InvalidLengthException("Invalid","Length");
        }else{
            super.setLength(length);
        }
    }

    @Override
    public void setWeight(double weight) throws InvalidWeightException {
        if(!validateWeight(weight)){
            throw new InvalidWeightException("Invalid","Weight");
        }else{
            super.setWeight(weight);
        }
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) throws InvalidRegistrationNumberException {
        if(!validateRegistrationNumber(registrationNumber)){
            throw new InvalidRegistrationNumberException("Invalid","Weight");
        }else{
            super.setRegistrationNumber(registrationNumber);
        }
    }
    private boolean validateWeight(double weight){
        return weight>1000.0 && weight<2000.0;
    }

    private boolean validateLength(double length){
        return length>1.5 && length<3.5;
    }

    @Override
    public boolean validateRegistrationNumber(String registrationNumber){
        return registrationNumber.length()>=6 && registrationNumber.length() <= 8;
    }
    @Override
    public void travel( String fromDestination, String toDestination){
        System.out.println("\uD83D\uDE97 " + fromDestination +" \uD83D\uDD1C "+toDestination);
    }
}

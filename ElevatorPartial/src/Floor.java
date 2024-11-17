package src;
// Representa un piso
class Floor {
    //numero del piso
    private int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    //retorno del numero del piso
    public int getFloorNumber() {
        return floorNumber;
    }

    @Override
    
    public String toString() {
        return "Piso " + floorNumber;
    }
}
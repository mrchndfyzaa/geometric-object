package geometricobject;
public abstract class GeometricObject {
    private String warna;
    private String choices;
    private boolean choices2;
    
    GeometricObject(){
        
    }
    
    GeometricObject(String warna, String choices){
        this.warna = warna;
        this.choices = choices;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public boolean getChoices(){
        if(choices.equalsIgnoreCase("Y")){
            choices2 = true;
        }
        else if (choices.equalsIgnoreCase("N")){
            choices2 = false;
        }
        return choices2;
    }
    
    @Override
    public String toString(){
        return "\nWarna : " + getWarna() + "\nFilled : " + getChoices();
    }
}

class Triangle extends GeometricObject {
    private double alas;
    private double tinggi;
    private double sisiMiring; 
    
    Triangle(){
        
    }
    
    Triangle (String warna, String choices, double alas, double tinggi, double sisiMiring){
        super(warna, choices);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;        
    }
    
    public double getAlas(){
        return alas;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getsisiMiring(){
        return sisiMiring;
    }   
    
    public double getArea(){
        return (getAlas() * getTinggi()) / 2;
    }
    
    public double getPerimeter(){
        return getAlas() + getTinggi() + getsisiMiring();
    }
    
    @Override
    public String toString(){
        return "\nAlas : " + getAlas() + "\nTinggi : " + getTinggi() + "\nSisi Miring : " + getsisiMiring() + "\nLuas : " + getArea() + "\nKeliling : " + getPerimeter() + super.toString();
    }
}

class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    
    }

    public Circle(double radius, String warna, String choices) {
        super(warna, choices);
	this.radius = radius;
    }

    public double getRadius() {
	return radius;
    }
    
    public double getArea() {
	return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Circle)o) == 0;
    }
    
    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius){
            return 1;
        }
	else if (this.radius < o.radius){
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override 
    public String toString() {
        return "Radius : " + getRadius() + "\nLuas : " + getArea() + "\nKeliling : " + getPerimeter() + super.toString();
    }
}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double sisi;

    public Octagon() {
    }

    public Octagon(double sisi, String warna, String choices) {
        super(warna, choices);
        this.sisi = sisi;
    }

    public double getSisi() {
	return sisi;
    }

    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * sisi * sisi;
    }

    public double getPerimeter() {
        return 8 * sisi;
    }

    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()){
            return 1;
        }
        else if (getArea() < o.getArea()){
            return -1;
        }
        else {
            return 0;
        }		
    }

    public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

    @Override 
    public String toString() {
        return "Sisi : " + getSisi() + "\nLuas : " + getArea() + "\nKeliling : " + getPerimeter() + super.toString();
    }
}

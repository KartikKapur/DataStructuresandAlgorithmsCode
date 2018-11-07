package Midterm1;

/**
 * Problem 3 Midterm 1 Practice Test 1
 */
public class Container {
    int size; boolean haslid; String name;
    public Container(){
        size = 0;
        haslid = false;
        name = "bad container";
        System.out.println("no constructor");}

    public Container(int size, boolean liddy, String name){
        this.size = size;
        this.haslid = liddy;
        this.name = name;
        System.out.println("here it is");}

    public void open() {
        System.out.println("there");}

    public void close() {
        if (!haslid) {
            System.out.println("Can’t close what isn’t there");}
        else{
            System.out.println("Closed");
        }}}


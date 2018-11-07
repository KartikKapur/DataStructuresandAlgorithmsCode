package Midterm1;

/**
 *  * Problem 5 Midterm 1 Practice Test 1
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    public void addLast(int x) {
        IntList p = this;
        while (p.rest != null) {
            p = p.rest;
        }
        p.rest = new IntList(x, null);
    }

    public void addAdjacent() {
        IntList p = this;
        if (p == null) {
            return;
        }
        IntList s = p;
        while (s.rest != null) {
            if (s.first == s.rest.first) {
                s.first = s.first * 2;
                s.rest = s.rest.rest;
                s = p;

            } else {
                s = s.rest;
            }
        }
    }


    public void addAdjacentRecursive() {
        IntList p = this;
        if (p == null) {
            return;
        }
        IntList s = p;
        while (s.rest != null) {
            if (s.first == s.rest.first) {
                s.first = s.first * 2;
                s.rest = s.rest.rest;
                addAdjacentRecursive();
                break;

            } else {
                s = s.rest;
            }
        }
    }
    public void dreaming(int n){

        if(this.size() == 0){
            this.first = n;
        }
        else{
            if(this.size() == 5){
                this.first = this.rest.first;
                this.rest = this.rest.rest;
            }
            IntList p = this;
            while(p.rest!=null){
                p = p.rest;
            }
            p.rest = new IntList(n, null);
        }
    }

    public int size(){
        int count = 0;
        IntList p = this;
        while(p != null){
            count ++;
            p = p.rest;
        }
        return count;
    }



}


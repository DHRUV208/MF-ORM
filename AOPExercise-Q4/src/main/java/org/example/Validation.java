package org.example;

public class Validation {
    public void IDCheck(long id)
    {
        try{
            IDNotFound(id);
        } catch(IDNotFoundException e) {
            System.out.println("ID Not Found");


        }

    }

    private void IDNotFound(long id) throws IDNotFoundException {
        if(id == 0)
        {
            throw new IDNotFoundException("ID NOT Found");
        }
    }
}

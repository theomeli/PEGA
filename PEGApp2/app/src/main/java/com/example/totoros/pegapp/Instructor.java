package com.example.totoros.pegapp;

    /**
     * Created by totoros on 12/10/2015.
     */
    public class Instructor {
        private String name;
        private String mail;
        private int image;

        public Instructor(String name, String mail, int image){
            this.name = name;
            this.mail = mail;
            this.image = image;
        }

        public void setName(String aName){name = aName;}

        public void setMail(String aMail){mail = aMail;}

        public void setImage(int anImage){image = anImage;}

        public String getName(){return name;}

        public String getMail(){return mail;}

        public int getImage(){return image;}
    }


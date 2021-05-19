package com.CinemaPrototypeServer;


import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private String director;
    private String[] actors;
    private String[] branches;
    
	private static final long serialVersionUID = -8224097662914849956L;

    public Movie(String title,String director, String[] actors, String[] branches){
        this.title=title;
        this.director=director;
        this.actors=actors;
        this.branches=branches;
    }


    public void printMovieDetails() {
        System.out.println("****");
        System.out.println("title: " + this.title);
        System.out.println("director: " + this.director);
        System.out.print("actors: ");
        for(String actor: this.actors){System.out.print(actor+" , ");}
        System.out.println("");
        System.out.print("branches: ");
        for(String branch: this.branches){System.out.print(branch+" , ");}
        System.out.println("*****");
    }


}
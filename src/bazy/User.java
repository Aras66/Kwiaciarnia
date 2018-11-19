/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazy;

/**
 *
 * @author Arkadiusz
 */
public class User {
    private int id;
    private int  telefon;
    private int  placa;
    private int  rabat;
    private String  imie;
    private String  nazwisko;
    private String  adres;
    private String  stanowisko;
    
    
    public User (int Id, String Imie, String Nazwisko, String Adres, int Telefon, String Stanowisko, int Placa, int Rabat )
{
this.id = Id;
this.imie = Imie;
this.nazwisko = Nazwisko;
this.adres = Adres;
this.telefon = Telefon;
this.stanowisko = Stanowisko;
this.placa = Placa;
this.rabat = Rabat;
}
    public int getId()
    {       return id;
    }
    public int getTelefon()
    {       return telefon;
    }
    public int getPlaca()
    {       return placa;
    }
    public int getRabat()
    {       return rabat;
    }
    public String getImie()
    {       return imie;
    }
    public String getNazwisko()
    {       return nazwisko;
    }
    public String getAdres()
    {       return adres;
    }
    public String getStanowisko()
    {       return stanowisko;
    }
}

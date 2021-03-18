package br.univates.model;

public class Editora
{

    int id;
    String nome;

    public Editora(String nome)
    {
        this.nome = nome;
    }

    public Editora(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

}

package com.code.parcial2_mm18014.models;

public class Libro {

        public String TituloLibro;
        public String autor;
        public String editorial;
        public int portadaImg;

        public Libro(String tituloLibro, String autor, String editorial, int portadaImg) {
            TituloLibro = tituloLibro;
            this.autor = autor;
            this.editorial = editorial;
            this.portadaImg = portadaImg;
        }
}

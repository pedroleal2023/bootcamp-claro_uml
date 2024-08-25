package com.example.device;

import com.example.navegador.Navegador;
import com.example.reprodutor.ReprodutorMusical;
import com.example.telefone.Telefone;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {


        @Override
        public void exibirPagina (String url){
            System.out.println("Página de navegação: " + url);
        }

        @Override
        public void adicionarNovaAba () {
            System.out.println("Nova aba de navegação. ");
        }

        @Override
        public void atualizarPagina () {
            System.out.println("Atualizando página atual.");
        }

        @Override
        public void tocar () {
            System.out.println("Tocando música.");
        }

        @Override
        public void pausar () {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica (String muscica){
            System.out.println("Musica selecionada: " + muscica);
        }

        @Override
        public void ligar (String numero){
            System.out.println("Ligando: " + numero);
        }

        @Override
        public void atender () {
            System.out.println("Atendendo a chamada.");
        }

        @Override
        public void iniciarCorreioVoz () {
            System.out.println("Iniciando Correio Voz.");
        }
    }


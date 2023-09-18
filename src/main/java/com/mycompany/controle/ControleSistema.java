/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoComputador;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.VisaoVideoGame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cintia.3990
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    public static void cadastrar(){
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
        
        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastroVideoGame());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastroComputador());
        }
    }
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        Object object = produtos.get(indiceProduto);

        if(object instanceof VideoGame){
           VideoGame videogame = new VideoGame();
           videogame = (VideoGame) object;
           
           System.out.println("Alterando o produto: " + videogame.toString());
           
           videogame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videogame);
           ControleSistema.produtos.set(indiceProduto, videogame);
        }else if(object instanceof Computador){
            Computador computador = new Computador();      
            computador = (Computador) object;
            
            System.out.println("Alteramdo o produto :" + computador.toString());
            
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.produtos.set(indiceProduto, computador);
        }
    }
    
    public static void listar(ArrayList<Object> produtos){
        for(int i = 0; i < produtos.size(); i++){
            Object object  = produtos.get(i);

            if(object instanceof VideoGame){
                VideoGame videogame = (VideoGame) object;
                System.out.println(videogame.toString());
            }else if(object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
            }
        }
    }
    
    public static void remover(int indiceProduto){
//        Object object = produtos.get(indiceProduto);
        
          System.out.println("Dseja mesmo remover este produto?");
          String sn = new Scanner(System.in).next().toLowerCase();

          if(sn.equals(Constantes.REMOVER_SIM)){
              try{
          produtos.remove(indiceProduto);
          System.out.println("Produto removido com sucesso!");
          }catch(Exception e){
                  System.out.println("Não foi possivel remover o produto pelo motivo " + e.getMessage());
                  }
}
}
}

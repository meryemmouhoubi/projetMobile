package com.example.pokemonapi.di;

import com.example.pokemonapi.repository.DetailRepository;
import com.example.pokemonapi.repository.MainRepository;

import javax.inject.Singleton;

import dagger.Component;

//@Singleton qui indique que les instances de cette interface sont créées et partagées à travers toute l'application.
@Singleton
@Component(modules = {NetworkModule.class, DatabaseModule.class})
public interface AppComponent {
   // Les méthodes injectMainRepository et injectDetailRepository sont des points d'injection de dépendances
   // pour les classes
   // MainRepository et DetailRepository, respectivement.
    //Cela permet à Dagger 2 de fournir les dépendances nécessaires à ces classes lorsqu'elles sont instanciées.
    void injectMainRepository(MainRepository mainRepository);

    void injectDetailRepository(DetailRepository detailRepository);
}


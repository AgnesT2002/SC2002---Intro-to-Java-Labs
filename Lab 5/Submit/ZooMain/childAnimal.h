#ifndef CHILDANIMAL_H_INCLUDED
#define CHILDANIMAL_H_INCLUDED

#include <iostream>
#include <string>

#include "animal.h"

class Dog: public Mammal
{
    string owner;

    public:
        Dog(string n, COLOR c, string o): Mammal(n,c)
        {
            o  = owner;
            cout << "name of Dog is " << name << " color is " << color << " owner is " << owner << endl;
        };

        ~Dog()
        {
            cout << "Destructing Dog object "<< name << endl;
        }

        void speak();
//        {
//            cout << "Woof"<< endl;
//        }

        void move();
//        {
//            cout << "Dog run"<< endl;
//        }

        void eat();
};

class Cat: public Mammal
{

    public:
        Cat(string n, COLOR c): Mammal(n,c)
        {
            cout << "name of Cat is " << name << " color is " << color << endl;
        };

        ~Cat()
        {
            cout << "Destructing Cat object "<< name << endl;
        }

        void speak();
//        {
//            cout << "Meow"<< endl;
//        }

        void move();
//        {
//            cout << "Cat crawl"<< endl;
//        }

        void eat();
};

class Lion: public Mammal
{
    public:
        Lion(string n, COLOR c): Mammal(n,c)
        {
            cout << "name of Lion is " << name << " color is " << color << endl;
        };

        ~Lion()
        {
            cout << "Destructing Lion object "<< name << endl;
        }

        void speak();
//        {
//            cout << "Roar"<< endl;
//        }

        void move();
//        {
//            cout << "Lion leap"<< endl;
//        }

        void eat();
};

#endif // CHILDANIMAL_H_INCLUDED

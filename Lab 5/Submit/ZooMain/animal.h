#ifndef ANIMAL_H_INCLUDED
#define ANIMAL_H_INCLUDED

#include <iostream>
#include <string>

using namespace std;

enum COLOR {Green, Blue, White, Black, Brown};

class Animal
{
    public :
        string name;
        COLOR color ;

    public:
        Animal(): name("unknown")
        {
            //cout << "constructing Animal object "<< name <<endl;
        }

        Animal(string n, COLOR c): name(n), color(c)
        {
            cout << "name of animal is " << n << " color is " << c << endl;
        }

        virtual ~Animal()     //must virtualize destructor so that subclasses can override this
        {
            cout << "Destructing Animal object "<< name << endl;
        }

        virtual void speak()
        {
            cout << "Animal speaks"<< endl;
        }

        virtual void move() = 0;    //Animal is now an abstract class

        virtual void eat() = 0;

};

class Mammal: public Animal
{
    public:
        Mammal(string n, COLOR c): Animal(n,c)
        {
            cout << "name of mammal is " << n << " color is " << c << endl;
        };

        virtual ~Mammal()
        {
            cout << "Destructing Mammal object "<< name << endl;
        }

        virtual void eat();
//        {
//           cout <<"Mammal eat " << endl;
//        }

        virtual void move();
//        {
//            cout <<"Mammal move " << endl;
//        }
};

#endif // ANIMAL_H_INCLUDED

#include <iostream>
#include <string>

using namespace std;

enum COLOR {Green, Blue, White, Black, Brown};

class Animal
{
    public:
        Animal(): _name("unknown")
        {
            cout << "constructing Animal object "<< _name <<endl;
        }

        Animal(string n, COLOR c): _name(n), _color(c)
        {
            cout << "name of animal is " << n << " color is " << c << endl;
        }

        ~Animal()
        {
            cout << "Destructing Animal object "<< _name << endl;
        }

        virtual void speak() const
        {
            cout << "Animal speaks"<< endl;
        }

        virtual void move() = 0;    //Animal is now an abstract class

    public :
        string _name;
        COLOR _color ;
};

class Mammal: public Animal
{
    public:
        //Mammal() _name("unknown mammal") {}

        Mammal(string n, COLOR c): Animal(n,c){};

        ~Mammal()
        {
            cout << "Destructing Mammal object "<< _name << endl;
        }

        void eat() const
        {
            cout <<"Mammal eat " << endl;
        }

        virtual void move()
        {
            cout <<"Mammal move " << endl;
        }
};

class Dog: public Mammal
{
    string _owner;

    public:
        Dog(string n, COLOR c, string owner): Mammal(n,c)
        {
            _owner  = owner;
        };

        ~Dog()
        {
            cout << "Destructing Dog object "<< _name << endl;
        }

        void speak() const
        {
            cout << "Woof"<< endl;
        }

        void move()
        {
            cout << "Dog run"<< endl;
        }
};

class Cat: public Mammal
{

    public:
        Cat(string n, COLOR c): Mammal(n,c){};

        ~Cat()
        {
            cout << "Destructing Cat object "<< _name << endl;
        }

        void speak() const
        {
            cout << "Meow"<< endl;
        }

        void move()
        {
            cout << "Cat crawl"<< endl;
        }
};

class Lion: public Mammal
{
    public:
        Lion(string n, COLOR c): Mammal(n,c){};

        ~Lion()
        {
            cout << "Destructing Lion object "<< _name << endl;
        }

        void speak() const
        {
            cout << "Roar"<< endl;
        }

        void move()
        {
            cout << "Lion leap"<< endl;
        }
};

int main()
{
//    Animal *animalPtr = new Dog("Lassie", White, "Andy");
//    animalPtr->speak();
//    animalPtr->move();
//    delete animalPtr;

//    Dog dogi("Lassie", White, "Andy");
//    Mammal *aniPtr = &dogi ;
//    Mammal &aniRef = dogi ;
//    Mammal aniVal = dogi ;
//    aniPtr->speak() ;   //woof
//    aniRef.speak() ;    //woof
//    aniVal.speak() ;    //Animal speak

    int choice;
    Mammal *zoo[99];
    int num = 0;
    cout << "Select the animal to send to Zoo :" << endl;
    do
    {
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit >";
        cin >> choice;

        switch(choice)
        {
            case 1:
            {
                string name = "Dog" + num;
                zoo[num] = new Dog (name, White);
                break;
            }
            case 2:
            {
                string name = "Cat" + num;
                zoo[num] = new Cat (name, Brown);
                break;
            }
            case 3:
            {
                string name = "Lion" + num;
                zoo[num] = new Lion (name, Black);
                break;
            }
            case 4:
            {
                cout << "Moving animals" << endl;
                break;
            }
            case 5:
            {
                cout << "Program exiting..." << endl;
                return 0;
            }

        }
        num++;   //will always be 1 more than actual value cus of case 4
    }while (choice <= 5);

    for (int i=0; i<num-1; i++)
    {
        zoo[i]->move();
        zoo[i]->speak();
        zoo[i]->eat();
    }

    delete []zoo;

    cout << "Program exiting..." << endl;

    return 0;
}

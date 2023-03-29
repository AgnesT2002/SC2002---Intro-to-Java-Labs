#include <iostream>
#include <string>

#include "animal.h"
#include "childAnimal.h"

using namespace std;

//implementation of class methods

void Mammal::eat()
{
   cout <<"Mammal eat " << endl;
}

void Mammal::move()
{
    cout <<"Mammal move " << endl;
}

void Dog::speak()
{
    cout << name << " Woof"<< endl;
}

void Dog::move()
{
    cout << name << " run"<< endl;
}

void Dog::eat()
{
    cout << name << " eat"<< endl;
}

void Cat::speak()
{
    cout << name <<" Meow"<< endl;
}

void Cat::move()
{
    cout << name << " crawl"<< endl;
}

void Cat::eat()
{
    cout << name << " eat"<< endl;
}

void Lion::speak()
{
    cout << name <<" Roar"<< endl;
}

void Lion::move()
{
    cout << name << " leap"<< endl;
}

void Lion::eat()
{
    cout << name << " eat"<< endl;
}

//////////////////////////////////////////////////body//////////////////////////////////////////////////////////
int main()
{
    int choice;
    Animal *zoo[99];
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
                string name = "Dog" + to_string(num);
                zoo[num++] = new Dog (name, White, "ZOO");
                break;
            }
            case 2:
            {
                string name = "Cat" + to_string(num);
                zoo[num++] = new Cat (name, Brown);
                break;
            }
            case 3:
            {
                string name = "Lion" + to_string(num);
                zoo[num++] = new Lion (name, Black);
                break;
            }
            case 4:
            {
                cout << "Moving animals..." << endl;
                break;
            }

            default:
            {
                cout << "Program exiting..." << endl;
                return 0;
            }

        }

    }while (choice != 4);

    for (int i=0; i<num; i++)
    {
        zoo[i]->move();
        zoo[i]->speak();
        zoo[i]->eat();
        delete zoo[i];  //delete one by one
    }

    cout << "Move complete" << endl;

    //delete []zoo;    //why dosent the destructor methods print statements?

    cout << "Program exiting..." << endl;

    return 0;
}

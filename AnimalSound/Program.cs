using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AnimalSound
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Animal ob;

            ob = new Animal(4);
            ob.Sound();

            ob = new Frog(2);
            ob.Sound();

            Console.Read();
        }
    }
    class Animal
    {
        public int noOfLegs;
        public Animal(int noOfLegs)
        {
            this.noOfLegs = noOfLegs;
        }

        public virtual void Sound()
        {
            Console.WriteLine("Parent -  Animal Class Sounds, with legs = "+noOfLegs);
        }
    }
    class Frog:Animal
    {
        public Frog(int noOfLegs):base(noOfLegs)
        {

        }
        public override void Sound()
        {
            Console.WriteLine("Child -Frog class, with legs = "+noOfLegs);
        }
    }

}

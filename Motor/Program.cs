using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Motor
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Vehicle ob=new Vehicle();   
            Vehicle ob = new Bike();
            ob.Show();

            Console.Read();
        }
    }
    abstract class Vehicle
    {
        public abstract void Show();
        
     }
    class Bike:Vehicle
    {
        public override void Show()
        {
            Console.WriteLine("I am a bike");
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kattis_Modulo
{
    class Modulo
    {
        static void Main(string[] args)
        {
            int nI = 0;  //index number
            uint[] unInput = new uint[10]; //array contains input
            int nDistinct = 0;

            //the loop
            while (nI < 10)
            {
                //take the input and convert to unsigned int numbers
                unInput[nI] = Convert.ToUInt16(Console.ReadLine());
                unInput[nI] = unInput[nI] % 42; //take the modulo

                int nI2 = 0;    //inside loop index number
                bool bDistinctFlag = true;  //flag to check distinct
                while (nI2 < nI)    //loop for checking distinct
                {
                    if (unInput[nI2] == unInput[nI])    //if the number exised
                        bDistinctFlag = false;          //mark the flag false

                    nI2++;
                }

                if (bDistinctFlag == true)  //if the flag is true
                    nDistinct++;            //increase the distinct number of modulo

                nI++;
            }

            Console.WriteLine(nDistinct);
            Console.Read();
        }
    }
}

Console.Write("Enter three integers separated by spaces: ");

string input = Console.ReadLine(); // read entire line of input as string
string[] parts = input.Split();     // split the string into individual parts

int a = int.Parse(parts[0]);        // parse the first part as integer and assign to variable a
int b = int.Parse(parts[1]);        // parse the second part as integer and assign to variable b
int c = int.Parse(parts[2]);        // parse the third part as integer and assign to variable c

Console.WriteLine($"a = {a}, b = {b}, c = {c}"); // print out the values of the variables
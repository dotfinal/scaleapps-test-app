# scaleapps-test-app

To run (if the project hasn't built, it'll build automatically using build.sh):

`./testapp.sh`

To build jar:

`./build.sh x y`

where x - input file name, y - output file name. If any of given names is "-" then stdin/stdout will be used instead.

The program reads one line patterned as "command [numbers]" from an input stream. There are 3 commands available:

**add** - returning a sum of all numbers as a result

**mul** - returning a product of all numbers as a result

**addmul** - returning number1 * number2 + number3 as a result



Using **add** or **mul** without providing numbers is acceptable. **addmul** can be used only with 3 numbers.




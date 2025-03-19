//Namespace = provides a solution for preventing name conflicts in large projects.
//            Each entity needs a unique name. A namespace allows for identically 
//            named entities as long as the namespaces are different.

#include <iostream>
//using namespace std; //Makes it so you do not need to include the std:: prefix to things like std::string and std::cout (saves typing)
                       //There is a high likelyhood of a naming conflict since there are so many naming conventions in namespace std;
                       //Safer option shown in main

namespace first {
    int x = 1;
}
namespace second {
    int x = 2;
}

int main() {
    
    int x = 0;                  //If not specified what namespace it goes with the local one
    std::cout << x << '\n';

    std::cout << first::x << '\n';

    std::cout << second::x << '\n';
    
    //Safer option than using namespace std;
    using std::cout;
    using std::string;

    string hello = "hello";
    cout << hello << '\n';
    
    return 0;
}

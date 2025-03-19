//typedef = a reserved keyword used to create an additional name (alias)
//          for another data type. New identtifier for an exsisting type
//          helps with readability and reduces typos


#include <iostream>
#include <vector>

//typedef std::vector<std::pair<std::string, int>> pairlist_t         //VERY COMPLEX DO NOT UNDERSTAND YET
typedef std::string text_t;
typedef int number_t;

//using text_t = std::string;           THE USING KEYWORD IS MORE POPULAR AND DOES THE EXACT SAME THING THAT TYPEDEF DOES!!!!!!!!!!!!!!!!!!!!!
//using number_t = int;


int main() {
    
    //std::vector<std::pair<std::string, int>> pairlist;    
    //pairlist_t pairlist;                                    //Use this instead of the line above

    text_t firstname = "Paxton"; //instead of std::string firstname;
    std::cout << firstname << '\n';

    number_t age = 19;
    std::cout << age << '\n';
}

// C++Guide - String Member Functions.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <fstream>

using std::cout;
using std::cin;
using std::string;

int main() {
    cout << "*****************************************************\n";
    cout << "************** String Member Functions **************\n";
    cout << "*****************************************************\n";

    cout << "\n--------------------- .Append ------------------------\n";  
    string word = "Hello";
    cout << "Original String: " << word << "\n";
    word.append("xyz"); cout << "word.append(""xyz"")" << "\n";
    cout << "Appended String: " << word << "\n";

    cout << "\n--------------------- .Assign ------------------------\n";
    string a = "Hi, I am string A.";
    string b = "Hi, I am string B.";
    cout << "String A: " << a << "\n";
    cout << "String B: " << b << "\n";
    b.assign(a); cout << "** b.assign(a) **\n";
    cout << "String A: " << a << "\n";
    cout << "String B: " << b << "\n";
    b.assign("Hello, there!"); cout << "** b.assign(""Hello, there!"") **\n";
    cout << "String B: " << b << "\n";

    cout << "\n--------------------- .At ------------------------\n";
    string testStr("Test string");
    for (unsigned i = 0; i < testStr.length(); ++i) {
        std::cout << testStr.at(i) << " ";
    }

    cout << "\n--------------------- .Back ------------------------\n";
    string backStr("hello world.");
    backStr.back() = '!';
    std::cout << backStr << '\n';
    
    cout << "\n--------------------- .Capacity ------------------------\n";
    string capacityStr("Test string");
    cout << "Capacity: " << capacityStr.capacity() << "\n";

    cout << "\n--------------------- .Clear ------------------------\n";
    string clearStr = "I have text.";
    cout << "Original String: " << clearStr << "\n";
    clearStr.clear();
    cout << " Cleared String: " << clearStr << "\n";

    cout << "\n--------------------- .Compare ------------------------\n";
    string str1("green apple");
    string str2("red apple");

    cout << str1.compare(str2); // -1 for false, 0 for true

    if (str1.compare(str2) != 0)
        cout << str1 << " is not " << str2 << '\n';

    if (str1.compare(6, 5, "apple") == 0)
        cout << "still, " << str1 << " is an apple\n";

    if (str2.compare(str2.size() - 5, 5, "apple") == 0)
        cout << "and " << str2 << " is also an apple\n";

    if (str1.compare(6, 5, str2, 4, 5) == 0)
        cout << "therefore, both are apples\n";

    cout << "\n--------------------- .Copy ------------------------\n";
    char buffer[20];
    string copyStr("Test string...");
    size_t length = copyStr.copy(buffer, 6, 5);     // .copy(Where copied to, how many char to copy, starting copy index)
    buffer[length] = '\0';
    std::cout << "buffer contains: " << buffer << '\n';

    cout << "\n--------------------- .Data ------------------------\n";
    int length2 = 0;

    string dataStr = "Test string";
    const char* cstr = "Test string";

    if (dataStr.length() == std::strlen(cstr))
    {
        cout << "str and cstr have the same length.\n";

        if (memcmp(cstr, dataStr.data(), dataStr.length()) == 0)
            cout << "dataStr and cstr have the same content.\n";
    }

    cout << "\n--------------------- .Empty ------------------------\n";
    string emptyStr = "I have data.";
    cout << "EmptyStr: " << emptyStr << "\n";
    cout << "Is Empty (T/F): " << emptyStr.empty() << "\n";    // 0 for false, 1 for true

    cout << "\n--------------------- .Erase ------------------------\n";
    string eraseStr("This is an example sentence.");
    cout << eraseStr << '\n';
                                                               // "This is an example sentence."
    eraseStr.erase(10, 8);                                     //             ^^^^^^^^
    cout << eraseStr << '\n';
                                                               // "This is an sentence."
    eraseStr.erase(eraseStr.begin() + 9);                      //           ^
    cout << eraseStr << '\n';
                                                               // "This is a sentence."
    eraseStr.erase(eraseStr.begin() + 5, eraseStr.end() - 9);  //       ^^^^^
    cout << eraseStr << '\n';
                                                               // "This sentence."

    cout << "\n--------------------- .Find ------------------------\n";
    std::string findStr("There are two needles in this haystack with needles.");
    std::string findStr2("needle");

    // different member versions of find in the same order as above:
    size_t found = findStr.find(findStr2);
    if (found != string::npos)
        cout << "first 'needle' found at: " << found << '\n';

    found = findStr.find("needles are small", found + 1, 6);
    if (found != string::npos)
        cout << "second 'needle' found at: " << found << '\n';

    found = findStr.find("haystack");
    if (found != string::npos)
        cout << "'haystack' also found at: " << found << '\n';

    found = findStr.find('.');
    if (found != string::npos)
        cout << "Period found at: " << found << '\n';

    // let's replace the first needle:
    findStr.replace(findStr.find(findStr2), findStr2.length(), "preposition");
    cout << findStr << '\n';

    cout << "\n--------------------- .Find_First_Not_Of ------------------------\n";
    string ffnoStr("look for non-alphabetic characters...");

    size_t found2 = ffnoStr.find_first_not_of("abcdefghijklmnopqrstuvwxyz ");

    if (found != string::npos)
    {
        cout << "The first non-alphabetic character is " << ffnoStr[found2];
        cout << " at position " << found << '\n';
    }

    cout << "\n--------------------- .Find_First_Of ------------------------\n";
    string ffoStr("Please, replace the vowels in this sentence by asterisks.");
    size_t found3 = ffoStr.find_first_of("aeiou");
    while (found3 != string::npos)
    {
        ffoStr[found3] = '*';
        found3 = ffoStr.find_first_of("aeiou", found3 + 1);
    }

    cout << ffoStr << '\n';

    cout << "\n--------------------- .Find_Last_Not_Of ------------------------\n";
    string flnoStr("Please, erase trailing white-spaces           ");
    cout << "Original String: [" << flnoStr << "]\n";
    string whitespaces0(" \t\f\v\n\r");  // common whitespace characters

    size_t found4 = flnoStr.find_last_not_of(whitespaces0);

    if (found4 != string::npos)
        flnoStr.erase(found4 + 1);  // erase from the first whitespace to the end
    else
        flnoStr.clear();            // string is all whitespace

    cout << " Trimmed String: [" << flnoStr << "]\n";

    cout << "\n--------------------- .Find_Last_Of ------------------------\n";
    string floStr1 = "/usr/bin/man";
    string floStr2 = "c:\\windows\\winhelp.exe";

    cout << "Splitting: " << floStr1 << '\n';
    size_t found5 = floStr1.find_last_of("/\\");
    cout << " path: " << floStr1.substr(0, found5) << '\n';
    cout << " file: " << floStr1.substr(found5 + 1) << '\n';

    cout << "Splitting: " << floStr2 << '\n';
    size_t found6 = floStr2.find_last_of("/\\");
    cout << " path: " << floStr2.substr(0, found6) << '\n';
    cout << " file: " << floStr2.substr(found6 + 1) << '\n';

    cout << "\n--------------------- .Front ------------------------\n";
    string frontStr("test string");
    cout << "Original: " << frontStr << '\n';
    frontStr.front() = 'T';
    cout << " Updated: " << frontStr << '\n';

    cout << "\n--------------------- .Insert ------------------------\n";
    std::string insertStr = "to be question";
    std::string insertStr2 = "the ";
    std::string insertStr3 = "or not to be";
    std::string::iterator insertIt;

    // used in the same order as described above:
    insertStr.insert(6, insertStr2);                                            // to be (the )question
    insertStr.insert(6, insertStr3, 3, 4);                                      // to be (not )the question
    insertStr.insert(10, "that is cool", 8);                                    // to be not (that is )the question
    insertStr.insert(10, "to be ");                                             // to be not (to be )that is the question
    insertStr.insert(15, 1, ':');                                               // to be not to be(:) that is the question
    insertIt = insertStr.insert(insertStr.begin() + 5, ',');                    // to be(,) not to be: that is the question
    insertStr.insert(insertStr.end(), 3, '.');                                  // to be, not to be: that is the question(...)
    insertStr.insert(insertIt + 2, insertStr3.begin(), insertStr3.begin() + 3); // (or )

    std::cout << insertStr << '\n';

    cout << "\n--------------------- .Length/.Size ------------------------\n";
    string lengthStr("Test string");    // 11 chars long
    cout << "The length of str is " << lengthStr.length() << " bytes.\n";

    cout << "The size of str is " << lengthStr.size() << " bytes.\n";


    cout << "\n--------------------- .Max_Size ------------------------\n";
    std::string maxsStr("Test string");
    std::cout << "max_size: " << maxsStr.max_size() << "\n";

    cout << "\n--------------------- .Operator[] ------------------------\n";
    string opbbStr("Test string");
    for (int i = 0; i < opbbStr.length(); ++i)
    {
        std::cout << opbbStr[i]; // <-- This
    }

    cout << "\n--------------------- .Operator+= ------------------------\n";
    string opeName("John");
    string opeFamily("Smith");
    opeName += " K. ";         // c-string
    opeName += opeFamily;      // string
    opeName += '\n';           // character
    cout << "Name: " << opeName;

    cout << "\n--------------------- .Operator+= ------------------------\n";
    string eqStr1, eqStr2, eqStr3;
    eqStr1 = "Test string: ";       // c-string
    eqStr2 = 'x';                   // single character
    eqStr3 = eqStr1 + eqStr2;       // string

    std::cout << eqStr3 << '\n';

    cout << "\n--------------------- .Pop_Back ------------------------\n";
    string pbStr("hello world!");
    pbStr.pop_back();
    pbStr.pop_back();
    pbStr.pop_back();
    cout << pbStr << '\n';

    cout << "\n--------------------- .Push_Back ------------------------\n";
    string pushbStr;
    std::ifstream file("test.txt", std::ios::in);
    if (file) {
        while (!file.eof()) pushbStr.push_back(file.get());                                             // <-------- Incomplete
    }
    cout << pushbStr << '\n';

    cout << "\n--------------------- .Replace ------------------------\n";
    string repBase = "this is a test string.";
    string repStr2 = "n example";
    string repStr3 = "sample phrase";
    string repStr4 = "useful.";

    // replace signatures used in the same order as described above:

    // Using positions:                       0123456789*123456789*12345
    string repStr = repBase;                  // "this is a test string."
    repStr.replace(9, 5, repStr2);            // "this is an example string." (1)
    repStr.replace(19, 6, repStr3, 7, 6);     // "this is an example phrase." (2)
    repStr.replace(8, 10, "just a");          // "this is just a phrase."     (3)
    repStr.replace(8, 6, "a shorty", 7);      // "this is a short phrase."    (4)
    repStr.replace(22, 1, 3, '!');            // "this is a short phrase!!!"  (5)

    // Using iterators:                                                                 0123456789*123456789*
    repStr.replace(repStr.begin(), repStr.end() - 3, repStr3);                          // "sample phrase!!!"      (1)
    repStr.replace(repStr.begin(), repStr.begin() + 6, "replace");                      // "replace phrase!!!"     (3)
    repStr.replace(repStr.begin() + 8, repStr.begin() + 14, "is coolness", 7);          // "replace is cool!!!"    (4)
    repStr.replace(repStr.begin() + 12, repStr.end() - 4, 4, 'o');                      // "replace is cooool!!!"  (5)
    repStr.replace(repStr.begin() + 11, repStr.end(), repStr4.begin(), repStr4.end());  // "replace is useful."    (6)
    cout << repStr << '\n';

    cout << "\n--------------------- .Reserve ------------------------\n";
    string reserveStr;

    std::ifstream file2("test.txt", std::ios::in | std::ios::ate);
    if (file2) {
        std::ifstream::streampos filesize = file2.tellg();
        reserveStr.reserve(filesize);                                   // <-------- Incomplete

        file2.seekg(0);
        while (!file2.eof())
        {
            reserveStr += file2.get();
        }
        cout << reserveStr;
    }

    cout << "\n--------------------- .Resize ------------------------\n";
    string resizeStr("I like to code in C");
    cout << resizeStr << '\n';

    unsigned sz = resizeStr.size();

    resizeStr.resize(sz + 2, '+');
    cout << resizeStr << '\n';

    resizeStr.resize(14);
    cout << resizeStr << '\n';


    cout << "\n--------------------- .RFind ------------------------\n";
    string rfingStr("The sixth sick sheik's sixth sheep's sick.");
    string key("sixth");

    size_t found8 = rfingStr.rfind(key);         // Searches the string for the last occurrence of the sequence specified by its arguments.
    if (found8 != string::npos)
        rfingStr.replace(found8, key.length(), "seventh");

    cout << rfingStr << '\n';

    cout << "\n--------------------- .Shrink_To_Fit ------------------------\n";
    string stfstr(100, 'x');
    cout << "1. capacity of str: " << stfstr.capacity() << '\n';

    stfstr.resize(10);
    cout << "2. capacity of str: " << stfstr.capacity() << '\n';

    stfstr.shrink_to_fit();
    cout << "3. capacity of str: " << stfstr.capacity() << '\n';

    cout << "\n--------------------- .Substr ------------------------\n";
    string subStr = "We think in generalities, but we live in details.";
    // (quoting Alfred N. Whitehead)

    string subStr2 = subStr.substr(3, 5);     // "think"

    size_t subPos = subStr.find("live");      // position of "live" in str

    string subStr3 = subStr.substr(subPos);     // get from "live" to the end

    cout << subStr2 << ' ' << subStr3 << '\n';

    cout << "\n--------------------- .Swap ------------------------\n";
    string buyer("money");
    string seller("goods");

    cout << "Before the swap, buyer has " << buyer;
    cout << " and seller has " << seller << '\n';

    seller.swap(buyer);

    cout << " After the swap, buyer has " << buyer;
    cout << " and seller has " << seller << '\n';

    // ITERATOR STRING MEMBER FUNCTIONS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    cout << "\n--------------------- .Begin ------------------------\n";
    std::string beginStr("Test string");                                             // str.begin() returns an iterator. Specifically, it returns a std::string::iterator,
    for (string::iterator it = beginStr.begin(); it != beginStr.end(); ++it) {       // which behaves like a pointer to the first character of the string.
        cout << *it;
        cout << " ";
    }

    //cout << "\n--------------------- .C_Str ------------------------\n";

    //cout << "\n--------------------- .CBegin ------------------------\n";

    //cout << "\n--------------------- .CEnd ------------------------\n";

    //cout << "\n--------------------- .CRBegin ------------------------\n";

    //cout << "\n--------------------- .CREnd ------------------------\n";

    //cout << "\n--------------------- .End ------------------------\n";
    
    //cout << "\n--------------------- .Get_Allocator ------------------------\n";

    //cout << "\n--------------------- .RBegin ------------------------\n";

    //cout << "\n--------------------- .REnd ------------------------\n";

    // String Member Constants (string::npos)
    // --------------------------------------
    // npos is a static member constant value with the greatest possible value for an element of type size_t.
    // This value, when used as the value for a len(or sublen) parameter in string's member functions, means "until the end of the string".
    // As a return value, it is usually used to indicate no matches.
    // This constant is defined with a value of - 1, which because size_t is an unsigned integral type, it is the largest possible representable value for this type.

    // Non-Member Overloads
    // --------------------
    // gettline (string)
    // operator+ (string)
    // operator<< (string)
    // operator>> (string)
    // relational operators (string)
    // swap (string)

    cout << "\n";
}



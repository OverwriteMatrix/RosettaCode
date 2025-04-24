@echo off
:loop
cls
for /f "tokens=1-4 delims=:.," %%a in ("%time%") do (
    echo Current Time: %%a:%%b:%%c
)
ping -n 2 127.0.0.1 > nul
goto loop

:: How It Works:
::  - for /f "tokens=1-4 delims=:.," %%a in ("%time%") splits the %time% variable into individual components (hours, minutes, seconds, and milliseconds).
::	- %%a, %%b, and %%c are used to capture the hours, minutes, and seconds from the %time% variable.
::	- echo Current Time: %%a:%%b:%%c prints the time without the milliseconds.
::	- ping -n 2 127.0.0.1 > nul provides a 1-second delay before updating the time.
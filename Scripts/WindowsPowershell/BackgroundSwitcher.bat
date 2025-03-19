@echo off
:loop
:: Run the first batch file
call "FilePath_First Background.bat"

:: Wait for 10 seconds
timeout /t 10 /nobreak

:: Run the second batch file
call "FilePath_GSM Background.bat"

:: Loop infinitely
goto loop

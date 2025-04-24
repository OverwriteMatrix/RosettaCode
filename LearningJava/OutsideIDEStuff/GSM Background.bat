@echo off
:: Set the wallpaper path
set wallpaper=C:\Users\Paxton.Clark\Downloads\GSM_Background.jpg

:: Change the wallpaper using Windows Registry
reg add "HKEY_CURRENT_USER\Control Panel\Desktop" /v Wallpaper /t REG_SZ /d "%wallpaper%" /f

:: Apply the wallpaper immediately
rundll32.exe user32.dll,UpdatePerUserSystemParameters

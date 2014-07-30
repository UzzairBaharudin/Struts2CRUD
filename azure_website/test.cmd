SET GRADLE_HOME=%~dp0%\gradle
SET GRADLEW_CMD=gradlew.bat

:: Setup
:: -----

setlocal enabledelayedexpansion

IF EXIST "%GRADLEW_CMD%" (
  call :ExecuteCmd "%GRADLE_CMD%" clean war
  IF !ERRORLEVEL! NEQ 0 goto error
)
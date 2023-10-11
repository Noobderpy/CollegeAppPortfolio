LevelsComplete = 0
TasksComplete = 0
unlockdoor = 0
global.gameComplete = 0

ini_open("file.ini");
LevelsComplete = ini_read_real( "STATE", "LevelsComplete", 0);
ini_close();

ini_open("file.ini");
global.gameComplete = ini_read_real( "STATE", "gameComplete", 0);
ini_close();
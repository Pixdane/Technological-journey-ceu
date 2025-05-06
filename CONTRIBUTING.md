# Contributing

## Quests
 - **TL;DR:** Remember to run 
    ```commandline
    python ./scripts/questbook.py
    ```
   after doing `/bq_admain default save`, it formats quest files for you.
 - You might notice fluid quest icons are using dummy fluid display items instead of buckets. Don't worry about how to get them, you can just use put a fluid bucket as the icon and the above-mentioned script will convert it for you.
 - To add / modify a quest title / description, you can either 1) go to the quest lang file and change that line, or 2) overwrite the quest key string in the QB directly and run above-mentioned script, it will automatically convert the raw string to lang keys and put the entry to the quest lang file.
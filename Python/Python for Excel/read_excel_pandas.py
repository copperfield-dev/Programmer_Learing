from pathlib import Path

import pandas as pd


def fix_missing(x):             
    return False if x in ["", "MISSING"] else x


df = pd.read_excel("xl/stores.xlsx",
                   sheet_name="2019", skiprows=1, usecols="B:F",
                   converters={"Flagship": fix_missing})
# print(df)
# print(df.info())

sheets = pd.read_excel("xl/stores.xlsx", sheet_name=["2019", "2020"],                                
                       skiprows=1, usecols=["Store", "Employees"])
# print(sheets["2020"].head(3))

df_1 = pd.read_excel("xl/stores.xlsx", sheet_name=0,                            
                     skiprows=2, skipfooter=3,                            
                     usecols="B:C,F", header=None,                            
                     names=["Branch", "Employee_Count", "Is_Flagship"])
# print(df_1)

df_2 = pd.read_excel("xl/stores.xlsx", sheet_name="2019",                             
                     skiprows=1, usecols="B,C,F", skipfooter=2,                             
                     na_values="MISSING", keep_default_na=False)
# print(df_2)

with pd.ExcelFile("xl/stores.xlsx") as f:
    df1 = pd.read_excel(f, "2019", skiprows=1, usecols="B:F", nrows=2)              
    df2 = pd.read_excel(f, "2020", skiprows=1, usecols="B:F", nrows=2)

print(df1)
print(f.sheet_names)

url = ("https://raw.githubusercontent.com/fzumstein/"                 
       "python-for-excel/1st-edition/xl/stores.xlsx")
df2 = pd.read_excel(url, skiprows=1, usecols="B:E", nrows=2)
print(df2)
import pandas as pd
import numpy as np   
import datetime as dt


data=[[dt.datetime(2020,1,1, 10, 13), 2.222, 1, True],                
      [dt.datetime(2020,1,2), np.nan, 2, False],                
      [dt.datetime(2020,1,2), np.inf, 3, True]]
df = pd.DataFrame(data=data,                            
                  columns=["Dates", "Floats", "Integers", "Booleans"])
df.index.name='index'
print(df)
# df.to_excel("written_with_pandas.xlsx", sheet_name="Output",                      
#             startrow=1, startcol=1, index=True, header=True,                      
#             na_rep="<NA>", inf_rep="<INF>")

with pd.ExcelWriter("written_with_pandas2.xlsx") as writer:              
    df.to_excel(writer, sheet_name="Sheet1", startrow=1, startcol=1)              
    df.to_excel(writer, sheet_name="Sheet1", startrow=10, startcol=1)              
    df.to_excel(writer, sheet_name="Sheet2")
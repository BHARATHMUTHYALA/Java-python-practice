import json
f1 = open('D:\Python Codes\question.json','r')
f2 = open('D:\Python Codes\hg.json','w')
r = dict(json.load(f1))
d = dict({})
for i,j in r.items():
    if r[i]['age']<24:
        d[i]=r[i]
json.dump(d,f2,indent=4)
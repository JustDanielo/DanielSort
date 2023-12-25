def daniel_sort2(liste):
    maxWert = 0
    minWert = liste[0]

    for value in liste:
        if value > maxWert:
            maxWert = value
        elif value < minWert:
            minWert = value      

    temp = [0 for _ in range((maxWert - minWert) + 1)]

    
    for value in liste:
        temp[value] += 1

    output = []

    for index in range(len(temp)):
        for i in range(temp[index]):
            output.append(index)

    return output        
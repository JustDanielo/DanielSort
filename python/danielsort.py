def daniel_sort(liste):
    maxWert = 0
    minWert = liste[0]

    for value in liste:
        if value > maxWert:
            maxWert = value
        elif value < minWert:
            minWert = value      

    temp = [[] for _ in range((maxWert - minWert) + 1)] # not good use danielsort2

    for value in liste:
        temp[value - minWert].append(value)

    output = []
    for value in temp:
        output.extend(value)

    return output        
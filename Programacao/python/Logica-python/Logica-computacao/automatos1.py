def aceita_termina_com_ab(palavra):
    estado = "q0"
    for c in palavra:
        if estado == "q0":
            estado = "q1" if c == "a" else "q0"
        elif estado == "q1":
            estado = "q2" if c == "b" else "q1" if c == "a" else "q0"
        elif estado == "q2":
            estado = "q1" if c == "a" else "q0"
    return estado == "q2"


print(aceita_termina_com_ab("xo"))
print(aceita_termina_com_ab("seoab"))

PGDMP     6                     {            task_db    15.1    15.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16458    task_db    DATABASE     ?   CREATE DATABASE task_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE task_db;
                postgres    false            ?            1259    16460    tbltasks    TABLE     ?   CREATE TABLE public.tbltasks (
    id integer NOT NULL,
    title character varying(255) NOT NULL,
    description character varying(255) NOT NULL,
    completed character varying(255) NOT NULL
);
    DROP TABLE public.tbltasks;
       public         heap    postgres    false            ?            1259    16459    tbltasks_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.tbltasks_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.tbltasks_id_seq;
       public          postgres    false    215            ?           0    0    tbltasks_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.tbltasks_id_seq OWNED BY public.tbltasks.id;
          public          postgres    false    214            e           2604    16463    tbltasks id    DEFAULT     j   ALTER TABLE ONLY public.tbltasks ALTER COLUMN id SET DEFAULT nextval('public.tbltasks_id_seq'::regclass);
 :   ALTER TABLE public.tbltasks ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            ?          0    16460    tbltasks 
   TABLE DATA           E   COPY public.tbltasks (id, title, description, completed) FROM stdin;
    public          postgres    false    215   ?
       ?           0    0    tbltasks_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.tbltasks_id_seq', 33, true);
          public          postgres    false    214            g           2606    16467    tbltasks tbltasks_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tbltasks
    ADD CONSTRAINT tbltasks_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.tbltasks DROP CONSTRAINT tbltasks_pkey;
       public            postgres    false    215            ?   ?   x?]??N?0???)?'8&Ft, `?????I\bW??=?ŉ???????{??=|x?'.	5p?
?̡P??b????T?w??=
?7V8p?")????
??A/????'?>??????ϗZ??b3ID
????C??i?u?kđ0?OZ'[????`?$ᜯ6??(%?Z?w?4E^??qS??D?Qy??o???p1?z????F?k?u?/?O?E     